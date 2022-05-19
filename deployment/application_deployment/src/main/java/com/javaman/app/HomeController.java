package com.javaman.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * 1.3 subclipse설치 후 연결정보 지정 확인한다.
 * 2.1 checkout을 통해 로컬 컴퓨터로 지정 소스를 가져온다.
 * 
 * 3.1 pom.xml의 자바의 버전을 1.8으로 지정하여라 
 * 3.2 spring framework의 버전을 5.0.7로 지정하여라.
 * 3.4. junit의 버전을 4.12 지정하고, 스프링 테스트 라이브러리를 의존성에 추가하여라.
 * 3.3. lombok 1.18.22를 mvnrepository에서 탐색하여 본인의 프로젝트에 지정한다.
 * 
 * <dependency>
 * 		<groupId>com.oracle<groupId>
 * 		<artifactId>ojdbc6<artifactId>
 * 		<version>12.1.0.2<version>
 * </dependency>
 * 3.5.위 의존성 추가하고 추가시 발생되는 문제에 대한 사유를 작성하여라.
 * 사유 : 
 *
 * 1.1 com.javman.domain.Member 클래스를 이용해 root-context.xml내에 bean을 작성한다.
 * 이때 userid에는 본인이름, userpw는 1234로 지정한다.
 * 2.2 MemberTests 클래스에서 Member타입 인스턴스를 주입받아 existMember()를 작성해 인스턴스 생성을 확인한다.
 * 1.4 MemberTests 클래스에서 Member타입 인스턴스를 주입받아 printMember() 메서드내에서 member인스턴스의 값을 log.info를 통해 확인한다.
 * 2.3 기존에 작성된 네이밍 규칙에 맞게 mapper 패키지를 생성하고 mapper인터페이스를 작성한다.
 * 1.2 기존 team 연결 설정을 제거하고 본인의 git계정으로 프로젝트를 share한다.
 * 4.1 작성한 코드를 war파일로 export를 수행한다. 단 source코드를 포함하여 export한다.
 * 4.2 해당 war파일을 본인의 aws상 tomcat에 적용한다.
 * 4.3 본인의 url로 인덱스 페이지를 열어 스크린샷 촬영 후 포함 제출한다.
 * 4.4 aws상 tomcat에 적용된 결과를 제거하여 원래 상태로 복원한다.
 * 

 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
