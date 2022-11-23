package com.webprojekti.webprojekti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DataRepository extends JpaRepository <Dataset, Long> {

    @Query(value ="SELECT * FROM hadcrut_5_0_1_0_analysis_summary_series_global_monthly", nativeQuery= true)
    List<String> getdata();

    
}
