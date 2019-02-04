----------------------------------
-- grant for HHS_HR_RW_ROLE
----------------------------------
GRANT SELECT ON HHS_CMS_HR.ADMIN_CODES TO HHS_HR_RW_ROLE;
GRANT SELECT ON HHS_CMS_HR.VW_STRATCON TO HHS_HR_RW_ROLE;
GRANT SELECT ON BIZFLOW.HHS_VW_CONSULTATION_PROC TO HHS_HR_RW_ROLE;
GRANT EXECUTE ON BIZFLOW.HHS_FN_GET_BUSDAYSDIFF TO HHS_HR_RW_ROLE;
GRANT EXECUTE ON BIZFLOW.HHS_FN_SUBTRACT_BUSDAY TO HHS_HR_RW_ROLE;

----------------------------------
-- grant for HHS_HR_DEV_ROLE
----------------------------------
GRANT SELECT ON HHS_CMS_HR.ADMIN_CODES TO HHS_HR_DEV_ROLE;
GRANT SELECT ON HHS_CMS_HR.VW_STRATCON TO HHS_HR_DEV_ROLE;
GRANT SELECT ON BIZFLOW.HHS_VW_CONSULTATION_PROC TO HHS_HR_DEV_ROLE;
GRANT EXECUTE ON BIZFLOW.HHS_FN_GET_BUSDAYSDIFF TO HHS_HR_DEV_ROLE;
GRANT EXECUTE ON BIZFLOW.HHS_FN_SUBTRACT_BUSDAY TO HHS_HR_DEV_ROLE;

----------------------------------
-- grant for HHS_HR
----------------------------------
GRANT SELECT ON HHS_CMS_HR.ADMIN_CODES TO HHS_HR;
GRANT SELECT ON HHS_CMS_HR.VW_STRATCON TO HHS_HR;
GRANT SELECT ON BIZFLOW.HHS_VW_CONSULTATION_PROC TO HHS_HR;
GRANT EXECUTE ON BIZFLOW.HHS_FN_GET_BUSDAYSDIFF TO HHS_HR;
GRANT EXECUTE ON BIZFLOW.HHS_FN_SUBTRACT_BUSDAY TO HHS_HR;


