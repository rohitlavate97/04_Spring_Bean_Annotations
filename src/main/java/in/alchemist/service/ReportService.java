package in.alchemist.service;

import in.alchemist.beans.ReportDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    //@Qualifier("mysqlDAO")  commenting it as @Primary annotation is used in MysqlDBReportDAO, we can inject using it instead of @Qualifier
    private ReportDAO reportDAO;
    public void gernerateReport(){
        reportDAO.getData();
        System.out.println("Report generated...");
    }
}
