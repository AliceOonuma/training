package jp.genuine.training.carmanager.service.oiling;

import jp.genuine.training.carmanager.model.oiling.Oiling;
import jp.genuine.training.carmanager.model.oiling.OilingId;

public interface OilingService {

	public Oiling findByOiling(OilingId oilingId);

}
