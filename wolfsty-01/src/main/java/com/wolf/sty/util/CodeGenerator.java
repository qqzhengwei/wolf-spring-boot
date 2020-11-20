package com.wolf.sty.util;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * mybatis-plus 代码生成器
 *
 * @author LiangY
 * @date 2019年04月02日
 */
public class CodeGenerator {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("dongbin");
        //gc.setFileOverride(true);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setOpen(false);
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        gc.setBaseColumnList(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://116.62.63.151:3316/yishengyue_platform_db?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT%2B8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("platform");
        dsc.setPassword("aaaaa888");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        String module = "api";
        // pc.setModuleName(module);
        pc.setParent("com.ysy.pm");
        pc.setController("controller.property_manage." + module);
        pc.setEntity("entity." + module);
        pc.setService("service." + module);
        pc.setServiceImpl("service." + module + ".impl");
        pc.setMapper("dao." + module);
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mybatis/mapper/" + module
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();

        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperEntityClass("com.ysy.pm.entity.BaseEntity");
        strategy.setSuperMapperClass("com.ysy.pm.common.mybatis.MyBaseMapper");
        strategy.setEntityLombokModel(false);
        strategy.setRestControllerStyle(true);
        strategy.setSuperControllerClass("com.ysy.pm.controller.BaseController");
        /*strategy.setInclude("pm_device_classification","pm_device_installation_area","pm_device_installation_location",
                            "pm_device_qr_record","pm_device_system","pm_inspection_device",
                            "pm_inspection_device_qr","pm_inspection_tasks","pm_inspection_tasks_detail",
                            "pm_inspection_time","pm_inspection_user");
        */
        strategy.setInclude("family_visitor");
        strategy.setSuperEntityColumns("id", "create_by", "create_time", "update_by", "update_time", "is_valid");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix("pm_");
        strategy.setEntityLombokModel(false);
        strategy.setVersionFieldName("version");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
