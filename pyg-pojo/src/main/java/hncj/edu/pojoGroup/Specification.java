package hncj.edu.pojoGroup;


import hncj.edu.pojo.TbSpecification;
import hncj.edu.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

public class Specification implements Serializable {
    //规格
    private TbSpecification specification;
    //规格参数
    private List<TbSpecificationOption> specificationOptionList;

    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }

    public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
        this.specificationOptionList = specificationOptionList;
    }

    public TbSpecification getSpecification() {
        return specification;
    }

    public void setSpecification(TbSpecification specification) {
        this.specification = specification;
    }


}
