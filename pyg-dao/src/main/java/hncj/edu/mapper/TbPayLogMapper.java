package hncj.edu.mapper;

import hncj.edu.pojo.TbPayLog;
import hncj.edu.pojo.TbPayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPayLogMapper {
    long countByExample(TbPayLogExample example);

    int deleteByExample(TbPayLogExample example);

    int deleteByPrimaryKey(String outTradeNo);

    int insert(TbPayLog record);

    int insertSelective(TbPayLog record);

    List<TbPayLog> selectByExample(TbPayLogExample example);

    TbPayLog selectByPrimaryKey(String outTradeNo);

    int updateByExampleSelective(@Param("record") TbPayLog record, @Param("example") TbPayLogExample example);

    int updateByExample(@Param("record") TbPayLog record, @Param("example") TbPayLogExample example);

    int updateByPrimaryKeySelective(TbPayLog record);

    int updateByPrimaryKey(TbPayLog record);
}