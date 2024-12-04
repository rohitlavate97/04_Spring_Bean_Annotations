package in.alchemist.service;

import in.alchemist.beans.ReportDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    @Qualifier("mysqlDAO")
    private ReportDAO reportDAO;
    public void gernerateReport(){
        reportDAO.getData();
        System.out.println("Report generated...");
    }
}
