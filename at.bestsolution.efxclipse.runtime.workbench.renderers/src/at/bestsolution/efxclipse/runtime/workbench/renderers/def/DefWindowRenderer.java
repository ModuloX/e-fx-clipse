package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.List;

import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;

import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseWindowRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWindow;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefWindowRenderer extends BaseWindowRenderer<Stage> {

	@Override
	protected Class<? extends WWindow<Stage>> getWidgetClass() {
		return WWindowImpl.class;
	}
	
	public static class WWindowImpl extends WLayoutedWidgetImpl<Stage, BorderPane, MWindow> implements WWindow<Stage> {
		private boolean support3d;
		private BorderPane rootPane;
		private BorderPane trimPane;
		private FillLayoutPane contentPane;
		
		@Inject
		public WWindowImpl(@Named("fx.scene.3d") @Optional Boolean support3d) {
			this.support3d = support3d != null && support3d.booleanValue();
		}

		@Override
		protected Stage createWidget() {
			Stage stage = new Stage();
			this.rootPane = new BorderPane();
			this.trimPane = new BorderPane();
			this.rootPane.setCenter(trimPane);
			this.contentPane = new FillLayoutPane();
			this.trimPane.setCenter(contentPane);
			
			// TODO Should we create the scene on show???
			if( support3d && Platform.isSupported(ConditionalFeature.SCENE3D) ) {
				Scene s = new Scene(rootPane,-1,-1,true);
				s.setCamera(new PerspectiveCamera());
				stage.setScene(s);
			} else {
				Scene s = new Scene(rootPane);
				stage.setScene(s);
			}

			return stage;
		}
		
		@Override
		public void setMainMenu(WLayoutedWidget<MMenu> menuWidget) {
			this.rootPane.setTop(menuWidget.getStaticLayoutNode());
		}
		
		@Override
		protected BorderPane getWidgetNode() {
			return rootPane;
		}
		
		@Override
		public void setX(double x) {
			getWidget().setX(x);
		}

		@Override
		public void setY(double y) {
			getWidget().setY(y);
		}

		@Override
		public void setWidth(double w) {
			getWidget().setWidth(w);
		}

		@Override
		public void setHeight(double h) {
			getWidget().setHeight(h);
		}

		@Override
		public void setBounds(double x, double y, double w, double h) {
			setX(x);
			setY(y);
			setWidth(w);
			setHeight(h);
		}

		@Override
		public void addStyleClasses(List<String> classnames) {
			rootPane.getStyleClass().addAll(classnames);
		}
		
		@Override
		public void setStyleId(String id) {
			rootPane.setId(id);
		}

		@Override
		public void show() {
			getWidget().toFront();
			getWidget().show();
		}
		
		@Override
		public void setTitle(String title) {
			getWidget().setTitle(title);
		}
		
		@Override
		public void setBottomTrim(WLayoutedWidget<MTrimBar> trimBar) {
			trimPane.setBottom(trimBar.getStaticLayoutNode());
		}
		
		@Override
		public void setLeftTrim(WLayoutedWidget<MTrimBar> trimBar) {
			trimPane.setLeft(trimBar.getStaticLayoutNode());
		}
		
		@Override
		public void setRightTrim(WLayoutedWidget<MTrimBar> trimBar) {
			trimPane.setRight(trimBar.getStaticLayoutNode());
		}
		
		@Override
		public void setTopTrim(WLayoutedWidget<MTrimBar> trimBar) {
			Node g = trimBar.getStaticLayoutNode();
			trimPane.setTop(g);
		}
		
		@Override
		public void addChild(WLayoutedWidget<MWindowElement> widget) {
			contentPane.getChildren().add(widget.getStaticLayoutNode());
		}
	}
}