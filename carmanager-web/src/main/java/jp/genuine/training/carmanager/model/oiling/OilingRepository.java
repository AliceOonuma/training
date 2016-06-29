package jp.genuine.training.carmanager.model.oiling;

import java.util.Optional;

public interface OilingRepository {

	public Optional<Oiling> findByOiling(OilingId oilingId);


}
