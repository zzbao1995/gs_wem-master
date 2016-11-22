package com.gs.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gs.dao.BaseDao;
import com.gs.entity.BaseEntity;

public class BaseController<T extends BaseEntity> {
	protected BaseDao<T> base;

	public void setBase(BaseDao<T> base) {
		this.base = base;
	}

	// 解决时间时期绑定问题
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("list", base.getAll());
		return "/list.jsp";
	}
}
