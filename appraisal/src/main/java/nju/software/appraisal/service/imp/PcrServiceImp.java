package nju.software.appraisal.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import nju.software.appraisal.data.DAO.PcrDAO;
import nju.software.appraisal.data.dataobject.Pcr;
import nju.software.appraisal.service.PcrService;
@Service("pcrService")
public class PcrServiceImp implements PcrService{

	@Resource
	private PcrDAO pcrDAO;
	@Override
	public String getPcjs(String rybh) {
		// TODO Auto-generated method stub
		Pcr pcr = pcrDAO.get("from Pcr where rybh=?", new Object[]{rybh});
		if(pcr!=null){
//			return pcr.getJsbh();
		}
		return "";
	}

}
