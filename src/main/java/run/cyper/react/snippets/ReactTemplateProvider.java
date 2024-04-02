package run.cyper.react.snippets;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class ReactTemplateProvider extends TemplateContextType {
    protected ReactTemplateProvider() {
        super("CORFU REACT", "Corfu React");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        String fileName = templateActionContext.getFile().getName();
        return fileName.endsWith(".js") || fileName.endsWith(".jsx") || fileName.endsWith(".ts") || fileName.endsWith(".tsx") || fileName.endsWith(".html");
    }
}
