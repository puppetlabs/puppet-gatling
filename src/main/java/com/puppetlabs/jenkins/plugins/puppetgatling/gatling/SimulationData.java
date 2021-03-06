package com.puppetlabs.jenkins.plugins.puppetgatling.gatling;

/**
 * SimulationData
 *
 * This object was created to be used within a HashMap while parsing the gatling reports, specifically stats.tsv
 *
 * A given statistic within a simulation.
 *
 * @author Brian Cain
 */
public class SimulationData {
    private String key;
    private String requestName;
    private int totalRequests;
    private int successfulRequests;
    private int failedRequests;
    private int meanResponseTime;

    public SimulationData(String key, String requestName, int totalRequests, int successfulRequests, int failedRequests, int meanResponseTime){
        this.key = key;
        this.requestName = requestName;
        this.totalRequests = totalRequests;
        this.successfulRequests = successfulRequests;
        this.failedRequests = failedRequests;
        this.meanResponseTime = meanResponseTime;
    }

    public String getKey(){
        return key;
    }

    public String getRequestName(){
        return requestName;
    }

    public int getTotalRequests(){
        return totalRequests;
    }

    public int getSuccessfulRequests(){
        return successfulRequests;
    }

    public int getFailedRequests(){
        return failedRequests;
    }

    public int getMeanResponseTime(){
        return meanResponseTime;
    }

    /**
     * prettyPrint - Prints the object so it doesn't make your eyes bleed
     *
     * @return result - String to print out
     */
    public String prettyPrint(){
        StringBuffer whitespace = new StringBuffer();
        int needed = 39-this.requestName.length();

        for(int i = 0; i<= needed + 3; i++){
            whitespace.append(" ");
        }

        String result = this.key + " " + this.requestName + whitespace.toString() + "[" + this.totalRequests + ",    " + this.successfulRequests + ",    " + this.failedRequests + ",    " +
                this.meanResponseTime + "]";
        return result;
    }
}
