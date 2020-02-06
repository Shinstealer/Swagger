package jp.co.pew.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()// ApiSelector : Swaggerで書き起こすAPIを選択する。
				.paths(PathSelectors.ant("/alpc/**")).build()// 指定したパスに一致するものだけをSwaggerに起こしてくれる
				.useDefaultResponseMessages(false)// 定義していないステータスコードを自動で付与してくれる。今回は自動付与をOFFに
				.host("jp.co.pew.swaggerSample")
				.apiInfo(apiInfo());// APIのインフォメーションを設定

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("ALPH Service")
				.description("This is the swagger sample")
				.version("0.0.1")
				.build();

	}

}
