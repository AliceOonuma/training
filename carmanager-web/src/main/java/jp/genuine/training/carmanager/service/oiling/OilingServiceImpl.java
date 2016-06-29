package jp.genuine.training.carmanager.service.oiling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.carmanager.exception.ResourceNotFoundException;
import jp.genuine.training.carmanager.model.oiling.Oiling;
import jp.genuine.training.carmanager.model.oiling.OilingId;
import jp.genuine.training.carmanager.model.oiling.OilingRepository;

@Service
public class OilingServiceImpl implements OilingService{

	@Autowired
	private OilingRepository oilingRepository;

	@Override
	public Oiling findByOiling(OilingId oilingId) {
		Oiling oiling = oilingRepository.findByOiling(oilingId).orElseThrow(ResourceNotFoundException :: new);
		return oiling;
	}



}
