package dk.smlaursen.TSNCF.application;

import java.util.Arrays;
import dk.smlaursen.TSNCF.architecture.EndSystem;

public class TTApplication extends Application{
	private int ttInterval = 500;
	private ExplicitPath explicitRoute;
	
	/** Assumes that all TTApplications are periodic so payloadSize and NoOfFrames is enough */
	public TTApplication(String name, int payloadSize, int noOfFrames, ExplicitPath path, EndSystem src, EndSystem ...dest) {
		super(name, payloadSize, noOfFrames, src, dest);
		explicitRoute = path;
	}
	
	public ExplicitPath getExplicitPath(){
		return explicitRoute;
	}
	
	@Override
	public int getInterval() {
		return ttInterval;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("TT ").append(aTitle);
		sb.append(" (").append(aNoOfFramesPerInterval).append(" x ").append(aMaxFrameSize).append("B / ").append(getInterval()).append("us)");
		sb.append(" (").append(aSource).append(" -> ").append(Arrays.toString(aDestinations)).append(")");
		sb.append(" Route (").append(explicitRoute).append(")");
		return sb.toString();
	}

	@Override
	public int getDeadline() {
		return 0;
	}
}
