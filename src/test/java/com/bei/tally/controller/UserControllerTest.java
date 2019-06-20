///** 
// * @Title: UserControllerTest.java 
// * @Package com.bei.tally.controller 
// * @Description: TODO(用一句话描述该文件做什么) 
// * @author 技术部--徐周环   -.- 
// * @date 2019年6月12日 下午2:57:11 
// * @version V1.0 
// */ 
//package com.bei.tally.controller;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.mock.web.MockHttpSession;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.transaction.TransactionConfiguration;
//import org.springframework.transaction.annotation.Transactional;
//
///** 
// * @ClassName: UserControllerTest 
// * @Description: TODO(这里用一句话描述这个类的作用) 
// * @author 技术部--徐周环   -.- 
// * @date 2019年6月12日 下午2:57:11 
// *  
// */
//@RunWith(SpringJUnit4ClassRunner.class) //这个必须使用junit4.9以上才有
//@ContextConfiguration(locations = {"classpath:spring-test.xml","classpath:spring-mybatis.xml"})
//@TransactionConfiguration(defaultRollback=true) //配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
//@Transactional  //事务处理
//public class UserControllerTest {
//
//	@Test
//	public void test() {
//		
//	}
//	
//	//mock模拟session
//    private MockHttpSession session;
//
//    //mock模拟request
//    private MockHttpServletRequest request;
//
//    @Before
//    public void setUp() throws Exception {
//
//        this.session = new MockHttpSession();
//        this.request = new MockHttpServletRequest();
//
//    }
//
//    @Test
//    public void testShow() throws Exception {
//
//        //创建参数
//        UserInfo userInfo = new UserInfo();
//        userInfo.setRegionCode("360482");
//        List<String> roleIdList = new ArrayList<>();
//        roleIdList.add("2410151");
//        userInfo.setRoleIdList(roleIdList);
//        session.setAttribute("userInfo",userInfo);
//        ModelMap modelMap = new ModelMap();
//        request.setSession(session);
//        String menuId = "21";
//
//        //构造controller
//        DeptController deptController = (DeptController) this.applicationContext.getBean("deptController");
//        String result = deptController.show(modelMap, menuId, request);
//
//        System.out.println("返回值：" + result);
//
//    }
//
//}
