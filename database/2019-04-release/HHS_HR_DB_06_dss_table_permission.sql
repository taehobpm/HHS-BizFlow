
----------------------------------
-- grant for HHS_HR_RW_ROLE
----------------------------------
GRANT DELETE, INSERT, SELECT, UPDATE ON HHS_HR.DSS_CMS_TIME_TO_HIRE TO HHS_HR_RW_ROLE;
GRANT DELETE, INSERT, SELECT, UPDATE ON HHS_HR.DSS_CMS_TIME_TO_HIRE_STG TO HHS_HR_RW_ROLE;

----------------------------------
-- grant for HHS_HR_DEV_ROLE
----------------------------------
GRANT DELETE, INSERT, SELECT, UPDATE ON HHS_HR.DSS_CMS_TIME_TO_HIRE TO HHS_HR_DEV_ROLE;
GRANT DELETE, INSERT, SELECT, UPDATE ON HHS_HR.DSS_CMS_TIME_TO_HIRE_STG TO HHS_HR_DEV_ROLE;
