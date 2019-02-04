
----------------------------------
-- grant for HHS_HR_RW_ROLE
----------------------------------

GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_TIME2OFFER_TABLE TO HHS_HR_RW_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_TIME2STAFF_TABLE TO HHS_HR_RW_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_CERT_TABLE TO HHS_HR_RW_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_AUDIT_TABLE TO HHS_HR_RW_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_ANN_TABLE TO HHS_HR_RW_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CMS_POSSESS_TABLE TO HHS_HR_RW_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CMS_TIME2HIRE_TABLE TO HHS_HR_RW_ROLE;

----------------------------------
-- grant for HHS_HR_DEV_ROLE
----------------------------------

GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_TIME2OFFER_TABLE TO HHS_HR_DEV_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_TIME2STAFF_TABLE TO HHS_HR_DEV_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_CERT_TABLE TO HHS_HR_DEV_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_AUDIT_TABLE TO HHS_HR_DEV_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CDC_ANN_TABLE TO HHS_HR_DEV_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CMS_POSSESS_TABLE TO HHS_HR_DEV_ROLE;
GRANT EXECUTE ON HHS_HR.SP_TRUNC_CMS_TIME2HIRE_TABLE TO HHS_HR_DEV_ROLE;