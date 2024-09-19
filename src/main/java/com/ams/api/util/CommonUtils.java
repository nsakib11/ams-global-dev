package com.ams.api.util;

//import com.ams.api.exception.ExceptionManager;
//import com.ams.api.exception.GlobalException;
import com.google.common.hash.Hashing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static com.ams.api.util.GlobalConstant.*;

@Component
public class CommonUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtils.class);

//	@Value("${global.txnKeyValidation}")
	private Boolean txnKeyValidation;

//	@Value("${global.payload.log}")
	private Boolean payloadLog;

	public static boolean isBypassedEndpoint(String url) {
		String path = url.substring(url.lastIndexOf("/") + 1);
		if (path.indexOf('?') > -1) {
			path = path.substring(0, url.lastIndexOf("?"));
		}
		return Arrays.asList(whiteListedEndpoints).contains(path);
	}

    public static String generateTransactionId(BigDecimal sequence) {
        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSSS"));
        return currentTime + sequence;
    }

    public static String generateTransactionId(BigDecimal sequence, String traceIdPrefix) {
        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSSS"));
        return traceIdPrefix + currentTime + sequence;
    }


	public static Double getAmountInDouble(String amt) {
		amt = amt.substring(0, amt.length() - 2) + "." + amt.substring(amt.length() - 2);
		return Double.valueOf(amt);
	}

	public static String generateSHA256Key(String str) {
		return Hashing.sha256().hashString(str, StandardCharsets.UTF_8).toString();
	}
	/*public void validateTxnKey(String clientKey, String txnKey) throws GlobalException {
		if (!txnKeyValidation){
			LOGGER.info("Txn Key validation is disabled.");
			return;
		}
		LOGGER.info("Txn Key validation is enabled.");
		if (clientKey == null || clientKey.isEmpty()){
			ExceptionManager.throwGlobalException(INVALID_FIELD_MANDATORY_ERROR_CODE, "TxnKey is mandatory.", INVALID_FIELD_MANDATORY_ERROR_TYPE);
		}
		else if(!clientKey.equalsIgnoreCase(txnKey)){
			ExceptionManager.throwGlobalException(INVALID_FIELD_MANDATORY_ERROR_CODE, "Transaction key not matched", INVALID_FIELD_MANDATORY_ERROR_TYPE);
			LOGGER.error("Transaction Key Not matched.");
		}
		LOGGER.info("Transaction key matched.");
	}*/

	public void printLog(String logMessage) {
		if (payloadLog){
			LOGGER.info(logMessage);
		}
	}

	public static String getReferenceNo() {
		return String.valueOf(System.currentTimeMillis())
				.concat(String.format("%09d", ThreadLocalRandom.current().nextLong(1000000000)));
	}

}