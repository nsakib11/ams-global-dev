package com.ams.api.audit.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/*@Entity
@Table(name="TBL_FCR_NGI_INTERFACE_LOG")
@Getter
@Setter
@ToString
@RequiredArgsConstructor*/
public class InterfaceLog implements Serializable {
	/*private static final long serialVersionUID = -8271086864595828367L;
	@Id
	@Column(name = "ID", nullable = false)
	private String id;
	@Column(name="TRANSACTION_ID", nullable= false)
	private String transactionId;
	@Column(name="DESTINATION_SYSTEM", nullable=false)
	private String destinationSystem;
	@Column(name="CONNECT_STRING", nullable= false)
	private String connectString;
	@Column(name="REQUEST_METHOD", nullable= false)
	private String requestMethod;
	@Column(name="REQUEST_TIME")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime requestTime;
	@Column(name="REQUEST_JSON")
	private byte[] requestJson;
	@Column(name="RESPONSE_TIME")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime responseTime;
	@Column(name="RESPONSE_JSON")
	private byte[] responseJson;
	@Column(name="PROCESS_TIME")
	private Long processTime;
	@Column(name="REMARKS")
	private String remark;
	@Column(name="STATUS_CODE")
	private String statusCode;
	@Column(name="CREATED_TIME")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime createdTime;
	@Column(name="CREATED_BY")
	private String createdBy;*/

}
