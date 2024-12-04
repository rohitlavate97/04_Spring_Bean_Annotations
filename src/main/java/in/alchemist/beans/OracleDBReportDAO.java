package in.alchemist.beans;

import org.springframework.stereotype.Repository;

@Repository("oracleDAO")
public class OracleDBReportDAO implements ReportDAO{
    @Override
    public void getData() {
        System.out.println("Getting data from Oracle DB");
    }
}
