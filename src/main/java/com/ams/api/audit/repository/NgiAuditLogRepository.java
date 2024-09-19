package com.ams.api.audit.repository;

import com.ams.api.audit.entity.NgiAuditLog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

//@Repository
public interface NgiAuditLogRepository /*extends JpaRepository<NgiAuditLog, String>*/ {

//	@Query(value = "SELECT  tbl_fcr_ngi_audit_sequence.nextval from dual", nativeQuery = true)
//	BigDecimal getNextSeriesId();
//
//	@Query(value = "SELECT * FROM TBL_FCR_NGI_AUDITLOG_NEW PARTITION (:partitionName)", nativeQuery = true)
//	List<NgiAuditLog> findByPartition(@Param("partitionName") String partitionName, Pageable pageable);
//
//	@Query(value = "select * from TBL_FCR_NGI_AUDITLOG c where TRANSACTION_ID=:orgRefUserNo order by PROCESSING_END_TIME desc FETCH FIRST 1 ROWS ONLY", nativeQuery = true)
//	NgiAuditLog findByTransactionId(@Param("orgRefUserNo") String orgRefUserNo);
}
   