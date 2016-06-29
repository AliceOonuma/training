package jp.genuine.training.carmanager.datasource.sampledb.oiling;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.carmanager.model.oiling.Oiling;
import jp.genuine.training.carmanager.model.oiling.OilingId;
import jp.genuine.training.carmanager.model.oiling.OilingRepository;

@Repository
public class OilingDataSource implements OilingRepository{

	@Autowired
	private OilingMapper oilingMapper;

	@Override
	public Optional<Oiling> findByOiling(OilingId oilingId) {
		Oiling oiling = oilingMapper.findByOiling(oilingId);
		return Optional.ofNullable(oiling);
	}

}
