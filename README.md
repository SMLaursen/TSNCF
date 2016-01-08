#TSNSolver

## Installation ##

## Dependencies ##
Being based on Java TSNSolver should run on all major platforms. Following external dependencies exists:
* [Apache Commons CLI](http://commons.apache.org/proper/commons-cli/) for Command Line Parsing
* [JGraphT](http://jgrapht.org/) jgrapht-core for the internal data-structures and algorithms
* JGraphx and JGraph-ext (Included in the [JGraphT](http://jgrapht.org/) download) for visualization (not mandatory)
* [JUnit](http://junit.org/) For unit-testing (not mandatory)
* [SLF4J](http://www.slf4j.org/) and [LogBack](http://logback.qos.ch/) for logging (not mandatory)

## Getting Started ##
The folder `/resource` includes some small example files. The solution for these can be displayed using the command where the -net argument refers to architecture files and -app argument for application files.
	
	$ Java -jar TSNSolver -net <file> -app <file> -display

## Authors ##
-[Sune Mølgaard Laursen](http://smlaursen.github.io/)

