package jp.genuine.training.carmanager.datasource.sampledb.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.carmanager.sample.SampleRepository;

@Repository
public class SampleDataSource implements SampleRepository
{
	@Autowired
	private SampleMapper mapper;

	@Override
	public String find() {
		String result = mapper.find();
		return result;
	}
}
