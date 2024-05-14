package ProjectIS216;

import javax.swing.*;
import java.awt.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.mariuszgromada.math.mxparser.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FunctionGraph extends JFrame {
   private JTextField inputField = new JTextField();
   private JButton drawButton = new JButton("Draw");
   private XYSeries series = new XYSeries("Function Graph");
   private XYSeriesCollection dataset = new XYSeriesCollection(series);
   private JFreeChart chart = ChartFactory.createXYLineChart(
      "Function Graph", "x", "y", dataset,
      PlotOrientation.VERTICAL, true, true, false);
   private ChartPanel chartPanel = new ChartPanel(chart);
   private final JButton btnNewButton = new JButton("Back");

   public FunctionGraph() {
   	setTitle("FUNCTIONGRAPHER");
   	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\KaWainUIT\\Java Project\\DrawGragh\\icon_function_gragh..jpg"));
      chartPanel.setLayout(null);
      getContentPane().setLayout(new MigLayout("", "[589px][6px][73.00px]", "[29px][434px][33px]"));
      inputField.setForeground(new Color(20, 108, 148));
      inputField.setFont(new Font("Tahoma", Font.PLAIN, 17));
      getContentPane().add(inputField, "cell 0 0 2 1,grow");
      drawButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
      drawButton.setBackground(new Color(175, 211, 226));
      drawButton.setForeground(new Color(20, 108, 148));
      getContentPane().add(drawButton, "cell 2 0,growx,aligny top");
      drawButton.addActionListener(event -> drawGraph());
      getContentPane().add(chartPanel, "cell 0 1 3 1,grow");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		setVisible(false);
			new MT().toFront();
			new MT().setState(java.awt.Frame.NORMAL);
      	}
      });
      btnNewButton.setForeground(new Color(20, 108, 148));
      btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
      btnNewButton.setBackground(new Color(175, 211, 226));
      getContentPane().add(btnNewButton, "cell 0 2 3 1,grow");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
      setVisible(true);
   }

   public void drawGraph() {
      series.clear();
      String input = inputField.getText();
      Function function = new Function(input);
      Argument x = new Argument("x");
      Expression expression = new Expression(input, x);
      for (double i = -10.0; i <= 10.0; i += 0.1) {
         x.setArgumentValue(i);
         double y = expression.calculate();
         series.add(i, y);
      }
   }

   public static void main(String[] args) {
      new FunctionGraph();
   }
}