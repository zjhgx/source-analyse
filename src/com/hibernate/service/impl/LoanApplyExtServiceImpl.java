package com.upg.loan.dl.service.impl;

import com.upg.loan.dl.core.ILoanApplyExtDao;
import com.upg.loan.dl.service.ILoanApplyExtService;
import com.upg.loan.mapping.LoanApplyExt;
import com.cs.lexiao.admin.framework.annotation.Service;
import com.cs.lexiao.admin.framework.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by zhangxin on 2017/9/11.
 */
@Service
public class LoanApplyExtServiceImpl extends BaseService implements ILoanApplyExtService {

    @Autowired
    private ILoanApplyExtDao loanApplyExtDao;

    @Override
    public void updateApplyExtStatusByTime(String timeBegin, String audittime) {
        loanApplyExtDao.updateApplyExtStatusByTime(timeBegin, audittime);
    }

    @Override
    public void saveOrUpdate(LoanApplyExt loanApplyExt) {
        loanApplyExtDao.saveOrUpdate(loanApplyExt);
    }

    @Override
    public Map<String, Object> getLoanStatusByLoanApplyNo(String loanApplyNo) {
        Map<String, Object> result = loanApplyExtDao.getLoanStatusByLoanApplyNo(loanApplyNo);
        return result;
    }

    @Override
    public LoanApplyExt getByLoanApplyId(Integer loanApplyId) {
        LoanApplyExt loanApplyExt = loanApplyExtDao.getByLoanApplyId(loanApplyId);
        return loanApplyExt;
    }
}
