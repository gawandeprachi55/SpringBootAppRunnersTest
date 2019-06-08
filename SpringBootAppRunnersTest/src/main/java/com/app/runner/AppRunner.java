package com.app.runner;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
//for Option args,read all keys
		Set<String> optKeys=args.getOptionNames();
		System.out.println(optKeys);
		//one key related values
		List<String> list=args.getOptionValues("profile");
		System.out.println(list);
		//check for key exist
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("profile"));
		//non-opt args
		List<String> nop=args.getNonOptionArgs();
		System.out.println(nop);
		//all args
		String[] arr=args.getSourceArgs();
		System.out.println(arr);
	}

}
