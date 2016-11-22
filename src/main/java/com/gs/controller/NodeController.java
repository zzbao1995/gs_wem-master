package com.gs.controller;

import java.util.Date;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gs.dao.BaseDao;
import com.gs.entity.Node;

@Controller
@RequestMapping("/Node")
public class NodeController extends BaseController<Node> {

	BaseDao<Node> base;
	
	@Override
	@Resource(name = "nodeDaoImpl")
	public void setBase(BaseDao<Node> base) {
		this.base=base;
		super.setBase(base);
	}
	
	@RequestMapping("/add")
	public String saveOrUpdate(Node entity, Model model) {
		entity.setDate(new Date());
		if (base.saveOrUpdate(entity)) {
			model.addAttribute("info", "数据输入完成");
		} else {
			model.addAttribute("info", "数据输入失败");
		}
		return "/Node/index";
	}
	@RequestMapping("/index")
	public String index(){
		return "/index.jsp";
	}
}
