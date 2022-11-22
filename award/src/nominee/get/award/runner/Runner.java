package nominee.get.award.runner;

import nominee.get.award.dto.KRAwardeesDTO;
import nominee.get.award.repository.KRAwardeesRepositoryImpl;
import nominee.get.award.service.KRAwardeesServiceImpl;

public class Runner {
	public static void main(String[] args) {
		KRAwardeesDTO dto=new KRAwardeesDTO(1,"rajkumar","cinema","not alive",62,"beng");
		KRAwardeesRepositoryImpl ok=new KRAwardeesRepositoryImpl();
		KRAwardeesServiceImpl impl=new KRAwardeesServiceImpl(ok);
		impl.validAndSave(dto);
	}
}
