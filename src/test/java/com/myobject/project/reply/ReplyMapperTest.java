package com.myobject.project.reply;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myobject.defaults.config.RootConfig;
import com.myobject.project.board.mapper.ReplyMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class})
@Log4j
public class ReplyMapperTest {

	@Setter(onMethod_ = {@Autowired})
	private ReplyMapper replyMapper;

	@Test
	public void test() {
		log.info(new Object() {}.getClass().getEnclosingMethod().getName());
		log.info(replyMapper);
	}
}
