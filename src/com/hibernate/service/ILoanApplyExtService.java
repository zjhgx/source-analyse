package com.upg.loan.dl.service;

import com.upg.loan.mapping.LoanApplyExt;
import com.cs.lexiao.admin.framework.base.IBaseService;

import java.util.Map;

/**
 * Created by zhangxin on 2017/9/11.
 */
public interface ILoanApplyExtService extends IBaseService {

    void updateApplyExtStatusByTime(String timeBegin, String audittime);

  
}
