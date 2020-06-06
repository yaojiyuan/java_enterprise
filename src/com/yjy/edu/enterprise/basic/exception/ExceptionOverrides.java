package com.yjy.edu.enterprise.basic.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ExceptionOverrides {

	public interface Paint {
		void paint() throws IOException, TimeoutException;
	}

	public class BasePaint implements Paint {
		@Override
		public void paint() throws FileNotFoundException {
		}
	}

}
