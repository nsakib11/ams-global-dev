package com.ams.api.util;

public class CommonFAPIErrorConstants implements CommonFCRJErrorConstants {

    /**
     *<p>Message ID:7073</p>
     *<p>Message: %6!s! %1!s! Priority Number should be unique for a particular instruction type</p>
     */
    public static final String MID_CH_UNIQUE_PRIORNO = "7073";

    /**
     *<p>Message ID:7074</p>
     *<p>Message: %6!s! %1!s! More than 1 account cannot have credit surplus value as Y</p>
     */
    public static final String MID_CH_DUP_SURPLUS_CRACCT = "7074";

    /**
     *<p>Message ID:7075</p>
     *<p>Message: %6!s! %1!s! Surplus Credit Account cannot be 'Y' <br>
     *   if Maximum Sweepout upto Drawing Power is 'N' for that account</p>
     */
    public static final String MID_CH_SURPLUS_CRACCT = "7075";
    /**
     *<p>Message ID:7128</p>
     *<p>Message: Value date cannot be less than CASA a/c opening date..</p>
     *
     */
    public static final String MID_ST_VALDAT_LT_CASA_ACOPDAT = "7128";
    /**
     *<p>Message ID:7153</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Drawdown account number entered should be a valid CASA account number and not an RD account number.</p>
     */
    public static final String MID_CH_INVALID_DRWDWN_ACCT = "7153";

    /**
     *<p>Message ID:7559</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Debit interest rate source can be changed only once
     */
    public static final String MID_CH_DR_INT_SRC_CHANGE = "7559";

    /**
     *<p>Message ID:7194</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Account being closed is in Minimum Lockin Period.</p>
     *
     */
    public static final String MID_CH_RD_MIN_LOCKIN_PRD = "7194";

    /**
     *<p>Message ID:7480</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Subsequent Disbursement not allowed on same day.
     */
    public static final String MID_LN_MULTIPLE_DISB = "7480";

    /**
     *<p>Message ID:7263</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Loan Account is suspended.
     */
    public static final String MID_LN_SUSPENDED_ACCT = "7263";

    /**
     *<p>Message ID:7072</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Cannot redeem a deposit for which the Lock-in term has not elapsed.
     */
    public static final String MID_TD_LOCKIN_TERM_NOT_ELAPSED = "7072";

    /**
     *<p>Message ID:7556</p>
     *<p>Message:  %4!s! LINE : %5!s! FUNCTION : %6!s! TD Product does not support Premature Redemption
     */
    public static final String MID_TD_NOT_SET_PREMAT_REDEEM = "7556";

    /**
     *<p>Message ID:7068</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Lien will be marked on full amount : %1!s!
     */
    public static final String MID_CH_LIEN_MKD_ON_FULL_AMT = "7068";

    /**
     *<p>Message ID:7181</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Invalid Due Dates %1!s!
     */
    public static final String MID_LN_INVALID_DATES_FOR_SCHEDULES = "7181";

    /**
     *<p>Message ID:7182</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! First and Final Disbursement %1!s!
     */
    public static final String MID_LN_FIRST_FINAL_DISB = "7182";

    /**
     *<p>Message ID:7183</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Final Disbursement %1!s!
     */
    public static final String MID_LN_LAST_DISB = "7183";

    /**
     *<p>Message ID:7184</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Interest Payment cannot be more than one %1!s!
     */
    public static final String MID_LN_INTPAY_CANNOT_BE_MORE = "7184";

    /**
     *<p>Message ID:7138</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Interest Installments cannot be zero.
     */
    public static final String MID_LN_INT_INSTALLS_ZERO = "7138";

    /**
     *<p>Message ID:7137</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Calendar Type Schedule Should Have Repayment Dates As Month End.
     */
    public static final String MID_LN_CLDR_MONTH_END = "7137";

    /**
     *<p>Message ID:7192</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Reschedule can be done only from the next day of disbursement. %1!s!
     */
    public static final String MID_LN_RESCH_NOT_ALLOW_ON_SAME_DAY = "7192";

    /**
     *<p>Message ID:7219</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Rescheduling cannot be done on day on which any payment has been made.Please try later.
     */
    public static final String MID_LN_NO_RESCH_TODAY = "7219";

    /**
     *<p>Message ID:7218</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Rescheduling cannot be done on a repayment date.Please try later.
     */
    public static final String MID_LN_NO_RESCH_REPAY_DATE = "7218";

    /**
     *<p>Message ID:7506</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Operation Not Allowed Since Some Of The Accounts Are Linked To Schemes.
     */
    public static final String MID_CI_SCHEME_LINKED = "7506";

    /**
     *<p>Message ID:7261</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! This is a Minor Customer
     */
    public static final String MID_CI_MINOR_CUSTOMER = "7261";

    /**
     *<p>Message ID:7020</p>
     *<p>Message: FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! For Denomination Type Deposits Payout Option Add To Principal Not Allowed
     */
    public static final String MID_TD_DENM_PROD_ADD_TO_PRINC_INVAL = "7020";

    /**
     *<p>Message ID:7556</p>
     *<p>Message:  %4!s! LINE : %5!s! FUNCTION : %6!s! TD Product does not support Premature Redemption
     */
    public static final String MID_CH_SWPOUT_NOT_SET_PREMAT_REDEEM = "7555";

    /**
     *<p>Message ID:7486</p>
     *<p>Message:  FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Some Relationships Are Setup More Than Once
     */
    public static final String MID_DEl_OPT = "7486";

    /**
     *<p>Message ID:7487</p>
     *<p>Message:  FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! Use  (-)  Button To Delete The Record
     */
    public static final String USE_DEL_BTN = "7487";

    /**
     *<p>Message ID:7485</p>
     *<p>Message:  FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! No Records Present, Use DELETE Option To Delete The Customer Group
     */
    public static final String MID_NO_HOUSEHOLD = "7485";

    /**
     *<p>Message ID:7193</p>
     *<p>Message:  %4!s! LINE : %5!s! FUNCTION : %6!s! Total Disbursement Amount Should Be Greater Than Zero. %1!s!
     */
    public static final String MID_LN_DISB_AMT_GREATER_THAN_ZERO = "7193";
    /**
     *<p>Message ID:7286</p>
     *<p>Message:  %4!s! LINE : %5!s! FUNCTION : %6!s! Invalid Deposit Status
     */
    public static final String MID_TD_INVALID_DEP_STATUS = "7286";

    /**
     *<p>Message ID: 7021</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! For Denomination Type Deposits Lien Could Be Marked Only On Principal</p>
     */
    public static final String MID_TD_DENM_PROD_LIEN_ONLY_PRINCIPAL = "7021";

    /**
     *<p>Message ID: 7024</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! Only Cumulative Base Rate allowed for Deposit with Denominations</p>
     */
    public static final String MID_TD_INV_BASE_RATE_FOR_DENM = "7024";

    /**
     *<p>Message ID: 7196</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! Amount entered is less than the minimum deposit amount for the TD Product selected. %1!s!</p>
     */
    public static final String MID_ECH_AMT_LT_MIN_DEP_PROD = "7196";

    /**
     *<p>Message ID: 7045</p>
     *<p>Message : FILE : %4!s! LINE : %5!s! FUNCTION : %6!s! %1!s! Bill type collateral can't be modified/Deleted</p>
     */
    public static final String MID_EBA_BI_COLL_CANT_MOD_DEL = "7045";

    /**
     *<p>Message ID: 7022</p>
     *<p>Message :  %4!s! LINE : %5!s! FUNCTION : %6!s! Certificate Not Issued To The Customer</p>
     */
    public static final String MID_TD_CERT_LOST_ONLY_FILED_TO_CUST = "7022";

    /**
     *<p>Message ID: 7023</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! Certificate Is Issued To The Customer</p>
     */
    public static final String MID_TD_CERT_ALREADY_ISSUED = "7023";

    /**
     *<p>Message ID: 7296</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! Date Should be Begining of Month for Calender Products</p>
     */
    public static final String MID_TD_DAT_BGN_CAL_PROD = "7296";

    /**
     *<p>Message ID: 7253</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! Account cannot be moved manually.</p>
     */
    public static final String MID_EAC_MVMT_MANUAL = "7253";

    /**
     *<p>Message ID: 7257</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! New CRR is less than the expected CRR.</p>
     */
    public static final String MID_EAC_REV_MVMNT_CRR = "7257";

    /**
     *<p>Message ID: 7262</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! New CRR is less than the expected CRR-Account has some dues</p>
     */
    public static final String MID_EAC_REV_MVMNT_CRR_DUES = "7262";

    /**
     *<p>Message ID: 7252</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! Arrears are outstanding for the account.</p>
     */
    public static final String MID_EAC_CHECK_ARREARS = "7252";

    /**
     *<p>Message ID: 7544</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! Tier balance will be greater than previous tier balance.</p>
     */
    public static final String MID_E_TIER_BAL_SUB = "7544";

    /**
     *<p>Message ID: 7243</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! %1!s! Overlapping %2!s!.</p>
     */
    public static final String MID_ECH_OVERLAPPING_VAR = "7243";

    /**
     *<p>Message ID: 7547</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! The Tier Plan selected is not valid for this Product.</p>
     */
    public static final String MID_E_SELECT_TIER_PROD = "7547";

    /**
     *<p>Message ID: 7267</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! Start date cannot be less than the last capitalization date.</p>
     */
    public static final String MID_EBA_ACCT_VAR_DAT = "7267";

    /**
     *<p>Message ID: 1890</p>
     *<p>Message :  %4!s! LINE : %5!s! FUNCTION : %6!s! %1!s! Row cannot be deleted %2!s! %3!s!.</p>
     */
    public static final String MID_ER_DELETE_ROW_ERR = "1890";

    /**
     *<p>Message ID: 7293</p>
     *<p>Message :  %4!s! LINE : %5!s! FUNCTION : %6!s! (Enter one of Teller, Account or Customer) OR (Maintain same date for From and To dates).</p>
     */
    public static final String MID_EAT_INQ_VAL = "7293";

    /**
     *<p>Message ID: 7311</p>
     *<p>Message :  For Mandatory Subsequent Disbursement Documents Status has to be either Returned or Received or Not Receieved.</p>
     */
    public static final String MID_ELN_MANDATORY_DOC_STAT_1 = "7311";

    /**
     *<p>Message ID:  7210</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! This Freeze Type is allowed only for LOANS accounts.</p>
     */
    public static final String MID_ECH_INV_ADJ_CASA = "7210";

    /**
     *<p>Message ID: 7211</p>
     *<p>Message : %4!s! LINE : %5!s! FUNCTION : %6!s! This Freeze Type is allowed only for CASA accounts.</p>
     */
    public static final String MID_ELN_INV_ADJ_LN = "7211";

    //FCVCO21_ITR1_SCF46: Added new error constants
    /**
     *<p>Message ID: 7211</p>
     *<p>Message : Only Future Dated Records Can Be Deleted.</p>
     */
    public static final String MID_ELN_DELETION_FUTURE_DT = "7191";

    /**
     *<p>Message ID: 7480</p>
     *<p>Message : Disbursement cannot be done on day on which any payment has been made.Please try later.</p>
     */
    public static final String MID_ELN_NO_DISB_TODAY = "7481";

    /**
     *<p>Message ID: 7481</p>
     *<p>Message : Disbursement cannot be done on a repayment date.Please try later.</p>
     */
    public static final String MID_ELN_NO_DISB_REPAY_DATE = "7482";

    /**
     *<p>Message ID: 7218</p>
     *<p>Message : Rescheduling cannot be done on a repayment date.Please try later.</p>
     */
    public static final String MID_ELN_NO_RESCH_REPAY_DATE = "7218";

    /**
     *<p>Message ID: 7942</p>
     *<p>Message : Date should be greater than or equal to Account Opening Date.</p>
     */
    public static final String MID_ELN_DISB_DAT_INVALID1 = "7942";

    /**
     *<p>Message ID: 7943</p>
     *<p>Message : Date should be less than or equal to Process Date.</p>
     */
    public static final String MID_ELN_DISB_DAT_INVALID2 = "7943";

    /**
     *<p>Message ID: 7955</p>
     *<p>Message : Only Disbursement by GL can be done for Backdated Disbursals.</p>
     */
    public static final String MID_ELN_INV_DISB_MODE_FOR_BKDATED = "7955";

    /**
     *<p>Message ID: 7141</p>
     *<p>Message : Number of Principal Installments cannot be zero.</p>
     */
    public static final String MID_ELN_PRINC_INSTALLS_ZERO = "7141";

    /**
     *<p>Message ID: 7951</p>
     *<p>Message : Compounding Frequency cannot be greater than the Installment Frequency.</p>
     */
    public static final String MID_ELN_FRQCOMP_GRT_FRQINST = "7951";

    /**
     *<p>Message ID: 7865</p>
     *<p>Message : This Stage will be removed from the Schedule.</p>
     */
    public static final String MID_ELN_STAGE_DELETE = "7865";

    /**
     *<p>Message ID: 6771</p>
     *<p>Message : Number of instalments cannot be zero.</p>
     */
    public static final String MID_ELN_CTR_NON_ZERO = "6771";

    /**
     *<p>Message ID: 8046</p>
     *<p>Message : Auto-disbursement instruction has been already set up for the account.</p>
     */
    public static final String MID_ELN_DISB_WNING = "8046";

    /**
     *<p>Message ID: 7945</p>
     *<p>Message : Renewal is allowed only for Manual Rollover Mode.</p>
     */
    public static final String MID_ELN_RENEWAL_NOT_ALLWD = "7945";

    /**
     *<p>Message ID: 7947</p>
     *<p>Message : Last stage in a schedule should always be a principal repay stage.</p>
     */
    public static final String MID_ELN_LAST_STAGE_PRINCREPAY = "7947";

    /**
     *<p>Message ID: 7928</p>
     *<p>Message : Maturity Date should be greater than Process Date.</p>
     */
    public static final String MID_EBA_MATURITYDATE_GREATERTHAN_PROCESSDATE =
            "7928";

    /**
     *<p>Message ID:8047</p>
     *<p>Message: Cannot delete account linked to TD as Collateral!</p>
     */
    public static final String MID_ELN_COLL_CANNOT_DEL = "8047";

    /**
     *<p>Message ID:7965</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Cannot Delete A System Generated Hold .</p>
     */
    public static final String MID_E_DEL_SYS_GEN_HOLD = "7965";

    /**
     *<p>Message ID:7925</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Product Type should be Revolving.</p>
     */
    public static final String MID_EBA_PRODUCT_TYPE_SHOULD_BE_REVOLVING =
            "7925";

    /**
     *<p>Message ID:SUCCESS</p>
     *<p>Message: SUCCESS.</p>
     */
    public static final String BRN_SUCCESS_CODE = "SUCCESS";
    /**
     *<p>Message ID:8149</p>
     *<p>Message: Beneficiary Enquiry error:Thrown when u dont have Beneficiary Enquiry permission</p>
     */
    public static final String MID_EOL_POS_BENF_ENQUIRY_FAIL = "8149";


    /**
     *<p>Message ID:8155</p>
     *<p>Message: Receipt Confirmation Number entry Locked</p>
     */
    public static final String MID_RCN_LOCKED = "8155";

    /**
     *<p>Message ID:8156</p>
     *<p>Message: Receipt Confirmation Number Already confirmed</p>
     */
    public static final String MID_RCN_CONFIRMED = "8156";

    /**
     *<p>Message ID:8157</p>
     *<p>Message: Invalid Receipt Confirmation Number</p>
     */
    public static final String MID_INVALID_RCN = "8157";

    /**
     *<p>Message ID:8158</p>
     *<p>Message: Receipt Confirmation Number has expired</p>
     */
    public static final String MID_RCN_EXPIRED = "8158";

    /**
     *<p>Message ID:8159</p>
     *<p>Message: No pin of this type Issued.</p>
     */
    public static final String MID_NO_PIN_ISSUED = "8159";

    /**
     *<p>Message ID:8160</p>
     *<p>Message: Pin of this type already issued.</p>
     */
    public static final String MID_PIN_ALREADY_ISSUED = "8160";

    /**
     *<p>Message ID:8161</p>
     *<p>Message: New Pin is same as old Pin.</p>
     */
    public static final String MID_PIN_SAME_AS_OLD = "8161";

    /**
     *<p>Message ID:8162</p>
     *<p>Message: Invalid PIN Status</p>
     */
    public static final String MID_INV_PIN_STATUS = "8162";

    /**
     *<p>Message ID:8163</p>
     *<p>Message: Lock Registration Failed.</p>
     */
    public static final String MID_SYS_LOCK_REGISTRATION_FAILED = "8163";

    /**
     *<p>Message ID:8164</p>
     *<p>Message: Lock UnRegistration Failed</p>
     */
    public static final String MID_SYS_LOCK_UNREGISTRATION_FAILED = "8164";

    /**
     *<p>Message ID:8165</p>
     *<p>Message: Already Registered for this System Lock</p>
     */
    public static final String MID_SYS_REGISTERED = "8165";

    /**
     *<p>Message ID:8166</p>
     *<p>Message: Not Registered for this System Lock</p>
     */
    public static final String MID_SYS_NOT_UNREGISTERED = "8166";

    /**
     *<p>Message ID:8167</p>
     *<p>Message : System Not Locked</p>
     */
    public static final String MID_SYS_NOT_LOCKED = "8167";

    /**
     *<p>Message ID:8168</p>
     *<p>Message: System already Locked</p>
     */
    public static final String MID_SYS_LOCKED = "8168";

    /**
     *<p>Message ID:8169</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Random Number locked due to Failure</p>
     */
    public static final String MID_RANDOM_LOCKED_FAILURE = "8169";

    /**
     *<p>Message ID:8170</p>
     *<p>Message: Customer is not blocked</p>
     */
    public static final String MID_CIF_CUST_UNBLOCKED = "8170";

    /**
     *<p>Message ID:8171</p>
     *<p>Message: Card has already been blocked</p>
     */
    public static final String MID_CM_CARD_BLOCKED = "8171";

    /**
     * FCVCO24_RS-BDI-CIF-001
     *
     * @author kedarf
     *<p>Message ID:7125</p>
     *<p>Message: Customer IC Cannot Exceed more than 30 Characters</p>
     */
    public static final String ECIF_CUST_IC_LENGTH_EXCEED="7125";

    /* FCR_CEFI_LNM44_TAG1 */

    /**
     *<p>Message ID:8430</p>
     *<p>Message: Rates not maintained for date</p>
     */
    public static final String ELN_RATE_NOT_MAINTAINED_FOR_DATE = "8430";

    /**
     *<p>Message ID:7576</p>
     *<p>Message: Contribution amount should be less than asset value.</p>
     */

    public static final String MID_ELN_CONTRIBUTION_AMT = "7576";

    /**
     *<p>Message ID:8260</p>
     *<p>Message: Limit currency doesn't match with account currency</p>
     */

    public static final String MID_ELM_LMT_ACCT_CCY_MISMATCH = "8260";


    /**
     *<p>Message ID:8376</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Account cannot be opened for deceased customer.</p>
     */

    public static final String MID_ECI_NO_ACCT_DECSD_CUST = "8376";

    /**
     *<p>Message ID:8291</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Customer is Blocked. %1!s!</p>
     */

    public static final String MID_CUST_BLOCKED = "8291";

    /**
     *<p>Message ID:7326</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Invalid company code.
     */
    public static final String MID_EOR_INV_COMP_CD = "7326";

    /* FCR_CEFI_LNM44_TAG1 */
    /**
     *<p>Message ID:8175</p>
     *<p>Message: Anniversary Type Schedule Should Not Have                     Disbursment Dates As Month End.</p>
     */
    public static final String MID_ELN_ANNIV_MONTH_END = "8175";

    /* FCR_CEFI_LNM44_TAG1 */
    /**
     *<p>Message ID:7886</p>
     *<p>Message: No. of instructions cannot be more than the                   max limit.</p>
     */
    public static final String MID_ELN_VALIDATE_MAX_INSTR = "7886";

    /* FCR_CEFI_LNM44_TAG1 */
    /**
     *<p>Message ID:7880</p>
     *<p>Message: Date for instruction should be a future date in the grid.</p>
     */
    public static final String MID_ELN_VALIDATE_INST_DATE = "7880";

    /* FCR_CEFI_LNM44_TAG1 */
    /**
     *<p>Message ID:7888</p>
     *<p>Message: Date for instruction cannot be more than the maturity date.</p>
     */
    public static final String MID_ELN_VALIDATE_MAT_DAT = "7888";

    /* FCR_CEFI_LNM44_TAG1 */
    /**
     *<p>Message ID:7881</p>
     *<p>Message: Amount for disbursement should be less then the sanctioned amount.</p>
     */
    public static final String MID_ELN_VALIDATE_DISB_AMT = "7881";

    /* FCR_CEFI_LNM44_TAG1 */
    /**
     *<p>Message ID:8039</p>
     *<p>Message: There can't be multiple disbursements on the same day.</p>
     */
    public static final String MID_ELN_GRID_SAME_DATE = "8039";

    /* FCR_CEFI_LNM44_TAG1 */
    /**
     *<p>Message ID:7885</p>
     *<p>Message: Loan product type should be Non-Revolving.</p>
     */
    public static final String MID_ELN_VALIDATE_COD_PROD = "7885";

    /* FCR_CEFI_LN521_TAG1 */
    /**
     *<p>Message ID:8368</p>
     *<p>Message: Revolving Loan Account cannot be disbursed from LN521. Please do the activation through LN523</p>
     */
    public static final String MID_ELN_CANNOT_DISB_REVLOAN = "8368";

    /**
     *<p>Message ID:8283</p>
     *<p>Message: %4!s! LINE : %5!s! FUNCTION : %6!s! Error! Loan Amount Breached : %1!s!</p>
     */

    public static final String MID_ELM_ERR_LN_AMT_BRCH = "8283";

    /**
     *
     * <p>Message ID:8190</p>
     * <p>Message: Arrear type should be ALL in case of TERM LOAN and External Counter Party</p>
     */
    public static final String MID_ELN_TL_ECP_NA="8190";

    /**
     * <p>Message ID:7972</p>
     * <p>Message: This arrear type is not applicable for Term Loans</p>
     */

    public static final String MID_ELN_ARREAR_TYP_NOT_ALLOWED= "7972";

    /**
     *<p>Message ID:8459</p>
     *<p>Message: Reschedule not supported for Rule 78.</p>
     */
    public static final String MID_ELN_RESCHED_NOT_SUPP_78 = "8459";
    /**
     *<p>Message ID:9007</p>
     *<p>Message: Disbursement date cannot be less than CASA a/c opening date..</p>
     *
     */
    public static final String MID_ST_VALDAT_DISB_DATE_CASA_ACOPDAT = "9007";

    /**
     *<p>Message ID:8470</p>
     *<p>Message: Invalid Selection</p>
     */
    public static final String MID_ELN_INV_COD_COMMIT = "8470";

    /**
     *<p>Message ID:8471</p>
     *<p>Message: Amount cannot be less than or equal to Zero</p>
     */
    public static final String MID_ELN_NO_OF_DAY_RAT_CHG_ZERO = "8471";
    /**
     *<p>Message ID:8486</p>
     *<p>Message: Subsidy pay-in has been done for this account .</p>
     */
    public static final String MID_ELN_SUBSIDY_PAYIN_DONE = "8486";
    /**
     *<p>Message ID:8487</p>
     *<p>Message: Subsidy rate should be greater than zero and less than account rate</p>
     */
    public static final String MID_ELN_INVALID_SUBSIDY_RATE = "8487";

    /**
     *<p>Message ID:13001</p>
     *<p>Message: Effective date can not be less than process date. </p>
     */
    public static final String MID_ELN_EFF_DAT_LT_DAT_PROCESS = "13001";

    /**
     *<p>Message ID:13002</p>
     *<p>Message: Future effective date can not be beyond 30  calendar days from date process. </p>
     */
    public static final String MID_ELN_EFF_DAT_BEYON_30_CAL_DAY = "13002";

    /**
     *<p>Message ID:13003</p>
     *<p>Message: Effective date can not be holiday. </p>
     */
    public static final String MID_ELN_EFF_DAT_HOLIDAY = "13003";

    /**
     *<p>Message ID:13004</p>
     *<p>Message: Effective date can not be maturity date / last installment date. </p>
     */
    public static final String MID_ELN_EFF_DAT_MATURITY_INSTAL_DAT = "13004";

    /**
     *<p>Message ID:13005</p>
     *<p>Message: Effective date can not be date in IOI or PMI stage. </p>
     */
    public static final String MID_ELN_EFF_DAT_IOI_PMI = "13005";

    /**
     *<p>Message ID:13006</p>
     *<p>Message: Effective date can not be end date of regular stage. </p>
     */
    public static final String MID_ELN_EFF_DAT_END_DAT_REGULAR_STG = "13006";

    /**
     *<p>Message ID:13007</p>
     *<p>Message: Selected event simulation option is invalid for current operation. </p>
     */
    public static final String MID_ELN_INVALID_EVEN_SIMULATION_OPTIONS = "13007";

    /**
     *<p>Message ID:13008</p>
     *<p>Message: Selected penalty method is invalid. </p>
     */
    public static final String MID_ELN_INVALID_PENALTY_METHOD = "13008";

    /**
     *<p>Message ID:13009</p>
     *<p>Message: PPF amount should be greater than or equal to minimum expected PayOff amount {1}. </p>
     */
    public static final String MID_ELN_PPF_AMT_SHD_GE_EXPCTED_PPF_AMT = "13009";

    /**
     *<p>Message ID:13010</p>
     *<p>Message: Selected Change Term/Installment option is invalid. </p>
     */
    public static final String MID_ELN_INVALID_RESCHED_OPTION = "13010";
    /**
     * <p>Message ID:7171 </p>
     * <p>Message:Value entered should be a postive value less than or equal to 100.</p>
     */
    public static final String MID_LIMIT_1_TO_100 = "7171";

    /**
     * <p>Message ID:8122 </p>
     * <p>Message:{0} {1}  has been Repaid.{2}  {3} has been Transferred..</p>
     */
    public static final String MID_ECH_MANUAL_TRANSFER_SUCCESSFUL = "8122";
    /**
     * <p>Message ID:2300 </p>
     * <p>Message:Invalid Account Status</p>
     */

    public static final String MID_CH_INVALID_ACCOUNT_STATUS="2300" ;

    /**
     * <p>Message ID:B999 </p>
     * <p>Message:Error:Mandatory UDF field can not be null:  {0}</p>
     */

    public static final String MID_BA_MANDATORY_UDF="B999" ;

    /**
     * <p>Message ID:BAM74_001 </p>
     * <p>Message:Invalid valuation source {0}</p>
     */

    public static final String MID_BA_INV_VALUATION_SRC = "BAM74_001" ;

    /**
     * <p>Message ID:13103 </p>
     * <p>Message:Customer creation / account opening is not allowed for prospect customer.</p>
     */

    public static final String MID_BA_INV_CIF_TYPE = "13103";

    /**
     * <p>Message ID:13104 </p>
     * <p>Message: Collateral Type and collateral code's collateral type is not matching.</p>
     */

    public static final String MID_BA_INV_COLL_TYPE_FOR_COLL_CODE = "13104";
    /**
     * <p>Message ID:8981 </p>
     * <p>Message:Funding Proportion of BDI should be between 0 and 100.</p>
     */
    public static final String MID_FUNDING_PROPORTION_BDI = "8981";
    /**
     * <p>Message ID:8982 </p>
     * <p>Message:Penalty Income shared to BDI should be between 0 and 100.</p>
     */
    public static final String MID_PENALTY_INCOME_SHARING = "8982";
    /**
     * <p>Message ID:8983 </p>
     * <p>Message:BDI's effective interest rate to AQ should be between 0 and 999.</p>
     */
    public static final String MID_EFFECTIVE_INTEREST_RATE = "8983";
    /**
     * <p>Message ID:8984 </p>
     * <p>Message:Limit End Date should be greater than Limit Start Date</p>
     */
    public static final String MID_LIMIT_DATE = "8984";
    /**
     * <p>Message ID:8985 </p>
     * <p>Message:Membership Card already Exists.Please enter a new membership card.</p>
     */
    public static final String MID_MEMBERSHIP_CARD_CHECK = "8985";
    /**
     * <p>Message ID:8986 </p>
     * <p>Message:BDI Interest Portion should be between 0 and 999.</p>
     */
    public static final String MID_INTEREST_PORTION = "8986";
    /**
     *  <p>Message:Reserved end date cannot be less than Current Process Date</p>
     */
    public static final String MID_RES_DAT_LT_DAT_PROCESS = "LN007";
    /**
     * <p>Message:Reserved end date cannot be greater than Available Limit date</p>
     */
    public static final String MID_RES_DAT_GT_DAT_AVAIL = "LN008";
    /**
     *<p>Message: Reserved Limit Amount cannot be greater than Available Limit Amount.</p>
     */
    public static final String MID_ELN_RES_AMT = "LN009";
    /**
     *<p>Message: Account Open Date cannot be backdated from Precess Date more thsn the days maintained in product level.</p>
     */
    public static final String MID_ELN_INV_ACCT_OPEN_DATE = "LN010";

    /**
     *<p>Message: LOS Id already exists for different customer	.</p>
     */
    public static final String MID_ELN_LOS_ID_NT_ALLOW = "LN013";

    /**
     *<p>Message: Advance Payment Parking GL must not be an Implemented GL.</p>
     */
    public static final String MID_ELN_ADV_PMT_GL_NT_IMP = "LN017";

    /**
     *<p>Message:  Down Payment Parking GL must not be an Implemented GL.</p>
     */
    public static final String MID_ELN_DWN_PMT_GL_NT_IMP = "LN018";

    /**
     *<p>Message:  Invalid Bank Code.Record for Bank Code Not Found.</p>
     */

    public static final String MID_ELN_BANK_CODE = "LN019";

    /**
     *<p>Message ID:LN023 </p>
     *<p>Message:Earmark Amount exists on Customer ID, So cannot delete the record.</p>
     */

    public static final String MID_EARMARK_AMT_EXISTS_ON_CUSTOMER = "LN023";

    /**
     *<p>Message ID:8549 </p>
     *<p>Message:Customer id is linked to some account.</p>
     */

    public static final String MID_CUSTOMER_LINKED_TO_ACCT = "8549";
    /**
     *<p>Message ID:8389 </p>
     *<p>Message:Net Rate must lie between Ceiling and Flat Rate.</p>
     */

    public static final int ERR_NET_RATE_BETWN = 8389;

}

