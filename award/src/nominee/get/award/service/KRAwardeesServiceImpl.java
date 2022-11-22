package nominee.get.award.service;

import nominee.get.award.dto.KRAwardeesDTO;
import nominee.get.award.repository.KRAwardeesRepositoryImpl;

public class KRAwardeesServiceImpl implements KRAwardeesService {

	private KRAwardeesRepositoryImpl repo;
	public KRAwardeesServiceImpl(KRAwardeesRepositoryImpl repo) {
		this.repo=repo;
	}
	
	@Override
	public void validAndSave(KRAwardeesDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String achieve = dto.getAchievement();
		String alive = dto.getAlive();
		int age = dto.getAge();
		String place = dto.getPlace();

		if (id > 0 && id < 100) {
			System.out.println("id valid");
			if (name.length() > 2 && name.length() < 100) {
				System.out.println("name valid");
				if (achieve.length() > 2 && achieve.length() < 100) {
					System.out.println("achieve valid");
					if (alive.length() > 2 && alive.length() < 100) {
						System.out.println("alive valid");
						if (age > 0 && age < 100) {
							System.out.println("age valid");
							if (place.length() > 2 && place.length() < 50) {
								System.out.println("place valid");
							this.repo.save(dto);
							} else {
								System.out.println("place not valid");
							}
						} else {
							System.out.println("age not valid");
						}
					} else {
						System.out.println("alive not  valid");
					}
				} else {
					System.out.println("achieve not valid");
				}
			} else {
				System.out.println("name not valid");
			}
		} else {
			System.out.println("id not valid");
		}
	}
}
