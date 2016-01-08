package dk.smlaursen.TSNSolver.solver;

import java.util.List;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

import dk.smlaursen.TSNSolver.application.Application;
import dk.smlaursen.TSNSolver.architecture.Node;
import dk.smlaursen.TSNSolver.evaluator.Evaluator;

/** Classes implementing the Solver interface are intended to return the {@link VLAN} assignments that given the topology and set of applications solves the problem.
 *  For non-analysis based solvers, the solve implementation will most likely make use of an {@link Evaluator} to score and direct the different guesses.  */
public interface Solver {
	
	/**@param topology the {@link Graph}
	 * @param applications the set of {@link Application}s
	 * @param eval the {@link Evaluator} to use for scoring
	 * @return the set of {@link VLAN} routings this solver deemed best within the given constraints*/
	public Set<VLAN> solve(final Graph<Node, DefaultEdge> topology,final List<Application> applications, Evaluator eval);
	
	/** Instructs the solver method to abort and return the currently best solution, if any, at the time of aborting*/
	public void abort();
}
