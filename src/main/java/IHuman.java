/**
 * An interface for Human and Doctor objects
 * 
 * @author Kacper Leśniański, Patryk Płóciennik
 * @version 1.0
 */
public interface IHuman
{
    /**
     * Update Human/Doctor
     */
    void update();

    /**
     * 
     * @return true if is alive
     */
    boolean isAlive();
    /**
     * 
     * @return true if is infected
     */
    boolean isInfected();

    /**
     * 
     * @return true if is a Doctor
     */
    boolean isDoctor();

    /**
     * 
     * @return true if has visible symptoms
     */
    boolean hasVisibleSymptoms();

    /**
     * Infect Human/Doctor with Virus
     * @param virus reference to Virus to infect Human/Doctor with
     */
    void infect(IVirus virus);

    /**
     * Cure from infection
     */
    void cure();

    /**
     * Kill Human/Doctor
     */
    void kill();
    /**
     * 
     * @return reference to Map Human/Doctor is stored in
     */
    Map getParentMap();
    /**
     * 
     * @return Coordinates of Human/Doctor
     */
    Coordinates getCoordinates();

    /**
     * Sets coordinates of Human/Doctor
     * @param coordinates to set
     */
    void setCoordinates(Coordinates coordinates);
    /**
     * 
     * @return reference to Virus Human/Doctor is infected by.
     */
    IVirus getVirus();

}
