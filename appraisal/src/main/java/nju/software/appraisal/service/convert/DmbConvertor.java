package nju.software.appraisal.service.convert;



import nju.software.appraisal.data.dataobject.Dmb;
import nju.software.appraisal.service.model.DmbModel;

import org.springframework.beans.BeanUtils;

/**
 * 
 * @author typ
 * 
 */
public class DmbConvertor {
	/**
	 * modelתΪdo
	 * 
	 * @param dmbModel
	 * @return
	 */
	public static Dmb modelToDo(DmbModel dmbModel) {
		Dmb dmb = new Dmb();
		BeanUtils.copyProperties(dmbModel, dmb);
		return dmb;
	}

	/**
	 * doתΪmodel
	 * 
	 * @param dmbDO
	 * @return
	 */
	public static DmbModel doToModel(Dmb dmb) {
		DmbModel dmbModel = new DmbModel();
		BeanUtils.copyProperties(dmb, dmbModel);
		return dmbModel;
	}
}
