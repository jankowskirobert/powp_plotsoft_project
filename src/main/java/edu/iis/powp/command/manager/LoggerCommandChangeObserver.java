package edu.iis.powp.command.manager;

import java.util.logging.Logger;

import edu.iis.powp.appext.FeaturesManager;
import edu.iis.powp.command.IPlotterCommand;
import edu.iis.powp.observer.Subscriber;

public class LoggerCommandChangeObserver implements Subscriber {
	
	private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public void update() {
		IPlotterCommand command = FeaturesManager.getPlotterCommandManager().getCurrentCommand();
		logger.info("Current command set to: " + command.toString());
	}
	
	public String toString() {
		return "Logger Command Change Observer";
	}

}
