package com.javaman.domain;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javman.domain.Member;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberTests {
	@Setter @Autowired
	Member member = new Member();
	
	@Test
	public void existMember() {
		assertNotNull(member);
	}
	
	@Test
	public void printMember() {
		log.info(member.getUserid());
		log.info(member.getUserpw());
	}
}
