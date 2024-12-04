package in.alchemist.app;

import in.alchemist.AppConfig;
import in.alchemist.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReportAppTestClass {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        ReportService reportService=context.getBean(ReportService.class);
        reportService.gernerateReport();
    }
}
