package com.ams.api.util;


public class CommonBDIErrorConstants extends CommonFAPIErrorConstants {

    /**
     *<p>Message ID:BDI_ONLINE_XFACE_001</p>
     *<p>Message: %6!s! %1!s! Priority Number should be unique for a particular instruction type</p>
     */
    public static final String MID_BDI_ONLINE_FEE_GL_ERR = "BDI_ONLINE_FEE_GL_LOAD";

    public static final String MID_BDI_ONLINE_SUSPENSE_GL_ERR = "BDI_ONLINE_SUSPENSE_GL_LOAD";

    public static final String BDI_NO_MNEMONIC_DEFINED_FOR_MPN_ERR = "BDI_ONLINE_TAX_PAY_INQ";

    public static final String BDI_INVALID_REVERSAL_INPUT = "ONL_BDI_001";

    public static final String BDI_INVALID_AO_CODE="ECIF_AOCODE";

    public static final String BDI_INVALID_LOB_CODE="ECIF_LOBCODE";

    public static final String BDI_INVALID_UDF_VALUE="BDI_UDF_FIELD_VALUE";

    public static final String BDI_INVALID_CUST_ID="BDI_UDF_CUST_ID";

    public static final String BDI_ONLINE_NO_ACCTS_FOUND = "BDI_NO_CRACT";

    public static final String BDI_ECHANNEL_NOT_ENABLED_ON_ACCT = "BDI_ECHN_AC";

    public static final String ERR_NO_RATES_FOUND = "ONL_BDI_002";

    public static final String ERR_INVALID_CONVERSION_INPUT = "ONL_BDI_003";

    public static final String ERR_INVALID_FOREIGN_EXCHNG_RAT = "ONL_BDI_004";

    public static final String ERR_FCC_PRODUCT_NOT_MNTED = "ONL_BDI_FCC";

    public static final String ERR_BI_RPT_DATA_NOT_MAINTAINED = "ONL_BDI_005";

    public static final String ERR_BOTH_ACCT_DIFF_FOREIGN_CCY = "ONL_BDI_006";

    public static final String ERR_RESTRICT_CHANNEL_TXN = "ONL_BDI_007";

    public static final String ERR_FCC_REMOTE_ERROR = "ONL_BDI_008";

    public static final String ERR_INVALID_CUSTID = "7000100";

    public static final String ERR_NO_ACCT_FOUND = "7000101";

    public static final String ERR_NO_ACCTS_WITH_STATMENT_FLG_Y = "7000102";

    public static final String ERR_NO_UDF_MAINTAINED = "7000104";
}

