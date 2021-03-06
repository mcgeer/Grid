
package UserInterface.Elements;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class WindSubComposite extends Composite {

	private Text bladeRadiusText;
	private Text airDensityText;
	private Text efficiencyText;
	private Text numberText;
	private Text costText;
	private Text longText;
	private Text latText;

	private Text[] textBoxes;
	private int xbound, ybound, xpadding, ypadding;
	private int lblLength, lblHeight;

	/**
	 * 
	 * @param arg0
	 *            higher level composite which this composite belongs to.
	 * @param arg1
	 *            style for the composite.
	 */
	public WindSubComposite(Composite arg0, int arg1) {
		super(arg0, arg1);

		xbound = arg0.getBounds().width;
		ybound = arg0.getBounds().height;
		lblHeight = ybound / 7;
		lblLength = 3 * xbound / 8;
		xpadding = xbound / 100;
		ypadding = ybound / 20;

		setElementsToComposite();
		setBackground(null);
		setBackgroundMode(SWT.INHERIT_FORCE);
		setBackgroundImage(getBackgroundImage());
		setLayout(null);
	}

	/**
	 * Sets the elements for the composite.
	 */
	private void setElementsToComposite() {

		Label lblRadius = new Label(this, SWT.NONE);
		lblRadius.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblRadius.setBounds(0, 0, lblLength, lblHeight);
		lblRadius.setText("Blade Radius (m):");
		lblRadius.setForeground(ColorPalette.CUSTOM_BLACK);

		Label lblDensity = new Label(this, SWT.NONE);
		lblDensity.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblDensity.setBounds(0, (lblHeight + ypadding), lblLength, lblHeight);
		lblDensity.setText("Air Density:");
		lblDensity.setForeground(ColorPalette.CUSTOM_BLACK);

		Label lblEfficiency = new Label(this, SWT.NONE);
		lblEfficiency.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblEfficiency.setBounds(0, 2 * (lblHeight + ypadding), lblLength, lblHeight);
		lblEfficiency.setText("Model Efficiency:");
		lblEfficiency.setForeground(ColorPalette.CUSTOM_BLACK);

		Label lblNumber = new Label(this, SWT.NONE);
		lblNumber.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblNumber.setBounds(0, 3 * (lblHeight + ypadding), lblLength, lblHeight);
		lblNumber.setText("Quantity #:");
		lblNumber.setForeground(ColorPalette.CUSTOM_BLACK);

		// Right 3
		Label lblCost = new Label(this, SWT.NONE);
		lblCost.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblCost.setBounds(3 * lblLength / 2 + xpadding, 0, 5 * lblLength / 9, lblHeight);
		lblCost.setText("Cost/Unit:");
		lblCost.setForeground(ColorPalette.CUSTOM_BLACK);

		Label lblLong = new Label(this, SWT.NONE);
		lblLong.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblLong.setBounds(3 * lblLength / 2 + xpadding, lblHeight + ypadding, 5 * lblLength / 9, lblHeight);
		lblLong.setText("Longitude:");
		lblLong.setForeground(ColorPalette.CUSTOM_BLACK);

		Label lblLat = new Label(this, SWT.NONE);
		lblLat.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblLat.setBounds(3 * lblLength / 2 + xpadding, 2 * lblHeight + 2 * ypadding, 5 * lblLength / 9, lblHeight);
		lblLat.setText("Latitude:");
		lblLat.setForeground(ColorPalette.CUSTOM_BLACK);

		bladeRadiusText = new Text(this, SWT.BORDER);
		bladeRadiusText.setBackground(ColorPalette.CUSTOM_WHITE);
		bladeRadiusText.setBounds(lblLength, 0, lblLength / 2, lblHeight);

		airDensityText = new Text(this, SWT.BORDER);
		airDensityText.setBackground(ColorPalette.CUSTOM_WHITE);
		airDensityText.setBounds(lblLength, (lblHeight + ypadding), lblLength / 2, lblHeight);

		efficiencyText = new Text(this, SWT.BORDER);
		efficiencyText.setBackground(ColorPalette.CUSTOM_WHITE);
		efficiencyText.setBounds(lblLength, 2 * (lblHeight + ypadding), lblLength / 2, lblHeight);

		numberText = new Text(this, SWT.BORDER);
		numberText.setBackground(ColorPalette.CUSTOM_WHITE);
		numberText.setBounds(lblLength, 3 * (lblHeight + ypadding), lblLength / 2, lblHeight);

		// Right 3
		costText = new Text(this, SWT.BORDER);
		costText.setBackground(ColorPalette.CUSTOM_WHITE);
		costText.setBounds(5 * lblLength / 9 + lblLength / 2 + xpadding + lblLength, 0, lblLength / 2, lblHeight);

		longText = new Text(this, SWT.BORDER);
		longText.setBackground(ColorPalette.CUSTOM_WHITE);
		longText.setBounds(5 * lblLength / 9 + lblLength / 2 + xpadding + lblLength, (lblHeight + ypadding),
				lblLength / 2, lblHeight);

		latText = new Text(this, SWT.BORDER);
		latText.setBackground(ColorPalette.CUSTOM_WHITE);
		latText.setBounds(5 * lblLength / 9 + lblLength / 2 + xpadding + lblLength, 2 * (lblHeight + ypadding),
				lblLength / 2, lblHeight);

		textBoxes = new Text[] { bladeRadiusText, airDensityText, efficiencyText };

	}

	/**
	 * Refreshes/ clears the text boxes in this composite.
	 */
	public void refreshView() {
		for (Text c : textBoxes)
			c.setText("");
	}

	// =================== Getters =========================================//

	/**
	 * 
	 * @return Returns Text of the Blade radius input.
	 */
	public String getBladeRadiusText() {
		return bladeRadiusText.getText();
	}

	/**
	 * 
	 * @return Returns the text in the airDensity text box.
	 */
	public String getAirDensityText() {
		return airDensityText.getText();
	}

	/**
	 * 
	 * @return Gets the efficiency of the wind mills from it's text box.
	 */
	public String getEfficiencyText() {
		return efficiencyText.getText();
	}

	/**
	 * 
	 * @return Gets the number of power generators built.
	 */
	public String getNumberText() {
		return numberText.getText();
	}

	/**
	 * @return Gets the cost for the power generator.
	 */
	public String getCostText() {
		return costText.getText();

	}

	/**
	 * 
	 * @return Gets longitude from text box.
	 */
	public String getLongText() {
		return longText.getText();

	}

	/**
	 * @return Gets the latitude from its text box.
	 */
	public String getLatText() {
		return latText.getText();

	}
}
