package jp.genuine.training.carmanager.datasource.sampledb.oiling;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.carmanager.model.oiling.Oiling;
import jp.genuine.training.carmanager.model.oiling.OilingId;

public interface OilingMapper {

	Oiling findByOiling(@Param("oilingId") OilingId oilingId );

}
