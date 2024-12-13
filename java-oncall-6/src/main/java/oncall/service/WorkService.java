package oncall.service;

import java.util.List;
import oncall.domain.CustomMonth;
import oncall.domain.DayOfWeek;
import oncall.domain.HoliWorker;
import oncall.domain.WeekWorker;
import oncall.domain.Work;
import oncall.repository.HoliWorkerRepository;
import oncall.repository.CustomMonthRepository;
import oncall.repository.WeekWorkerRepository;
import oncall.repository.WorkRepository;
import oncall.vo.WorkingDayInfo;

public class WorkService {

    private final WorkRepository workRepository;
    private final WeekWorkerRepository weekWorkerRepository;
    private final HoliWorkerRepository holiWorkerRepository;
    private final CustomMonthRepository customMonthRepository;

    public WorkService(WorkRepository workRepository, WeekWorkerRepository weekWorkerRepository,
        HoliWorkerRepository holiWorkerRepository, CustomMonthRepository customMonthRepository) {
        this.workRepository = workRepository;
        this.weekWorkerRepository = weekWorkerRepository;
        this.holiWorkerRepository = holiWorkerRepository;
        this.customMonthRepository = customMonthRepository;
    }

    public void saveWeekWorkers(List<WeekWorker> weekWorkers) {
        weekWorkerRepository.saveAll(weekWorkers);
    }

    public void saveHoliWorkers(List<HoliWorker> holiWorkers) {
        holiWorkerRepository.saveAll(holiWorkers);
    }

    public void createWorkSchedule(WorkingDayInfo workingDayInfo) {
        CustomMonth customMonth = customMonthRepository.findByMonth(workingDayInfo.getMonth());
        DayOfWeek dayOfWeek = DayOfWeek.findByDescription(workingDayInfo.getDayOfWeek());
        createWorks(customMonth, dayOfWeek);
    }

    private void createWorks(CustomMonth customMonth, DayOfWeek dayOfWeek) {
        List<WeekWorker> weekWorkers = weekWorkerRepository.getAll();
        List<HoliWorker> holiWorkers = holiWorkerRepository.getAll();
        int weekCount = 0;
        int holiCount = 0;
        for (int i = 0; i < customMonth.getLastDay(); i++) {
            if (customMonth.isHoliday(i) || DayOfWeek.isWeekend(dayOfWeek)) {
                workRepository.save(new Work(customMonth, dayOfWeek, holiWorkers.get(holiCount).getName()));
                holiCount = (holiCount + 1) % holiWorkers.size();
                continue;
            }
            workRepository.save(new Work(customMonth, dayOfWeek, weekWorkers.get(weekCount).getName()));
            weekCount = (weekCount + 1) % weekWorkers.size();
        }
    }
}
