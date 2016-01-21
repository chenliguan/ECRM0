package com.demo.customer_management;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.demo.util.BaseTest;


@Transactional
@Rollback(value=false)
public class TestContactService extends BaseTest
{
	
}
