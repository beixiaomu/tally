package com.bei.tally.util.g;



import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class MybatisGenerateRun {
	public void generator() throws Exception{
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//加载generatorEmallConfig文件
		File configFile = new File(MybatisGenerateRun.class.getClassLoader().getResource("generator/generatorConfig.xml").getPath());
		//加载数据库信息，例如driverClassName，username,password,url等
		Properties extraProperties = PropertiesLoaderUtils.loadAllProperties("config/jdbc.properties");
		ConfigurationParser cp = new ConfigurationParser(extraProperties, warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
	public static void main(String[] args) throws Exception {
		try {
			MybatisGenerateRun generatorSqlmap = new MybatisGenerateRun();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		   System.out.println("生成成功！");
		   System.exit(0);
	    }
}
