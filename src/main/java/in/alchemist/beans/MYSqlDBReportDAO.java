package in.alchemist.beans;

import org.springframework.stereotype.Repository;

@Repository("mysqlDAO")
public class MYSqlDBReportDAO implements ReportDAO{
    @Override
    public void getData() {
        System.out.println("Getting data from MYSql DB");
    }
}
