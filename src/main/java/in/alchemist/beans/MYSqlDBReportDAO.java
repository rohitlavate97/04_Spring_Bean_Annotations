package in.alchemist.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlDAO")
@Primary
public class MYSqlDBReportDAO implements ReportDAO{
    @Override
    public void getData() {
        System.out.println("Getting data from MYSql DB");
    }
}
