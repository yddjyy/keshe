package hncj.edu.mapper;

import hncj.edu.pojo.TbFreightTemplate;
import hncj.edu.pojo.TbFreightTemplateExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TbFreightTemplateMapper {
    long countByExample(TbFreightTemplateExample example);

    int deleteByExample(TbFreightTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbFreightTemplate record);

    int insertSelective(TbFreightTemplate record);

    List<TbFreightTemplate> selectByExample(TbFreightTemplateExample example);

    TbFreightTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateExample example);

    int updateByExample(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateExample example);

    int updateByPrimaryKeySelective(TbFreightTemplate record);

    int updateByPrimaryKey(TbFreightTemplate record);
}