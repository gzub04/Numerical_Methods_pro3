function draw_graph(type)
    if type == "ode_45"
        % x1(t) and x2(t) on the same graph
        figure;
        t_bounds = [0, 15];
        init_x = [-0.4, 0.5];
        ode45(@func, t_bounds, init_x);
        grid on;
        title("Ode45 x1(t) and x2(t)");
        legend("x1(t)", "x2(t)");
        % x1(x2)
        figure;
        [~, x] = ode45(@func, t_bounds, init_x);
        plot(x(:, 1), x(:, 2));
        grid on;
        title("Ode45 x1(x2)");

    elseif type == "RK4"
        % draws x1(t) with different steps
        figure;
        h = 1;
        while (h >= 0.0625)
        [t, x] = RK4(h, 15);
        plot(t, x(:, 1));
        grid on;
        hold on;
        h = h/2;
        end
        legend("Step: " + 1, "Step: " + 0.5, "Step: " + 0.25, "Step: " + 0.125, "Step: " + 0.0625);
        title("RK4: x1(t)");
        hold off;
        % draws x2(t) with different steps
        figure;
        h = 1;
        while (h >= 0.0625)
        [t, x] = RK4(h, 15);
        plot(t, x(:, 2));
        grid on;
        hold on;
        h = h/2;
        end
        legend("Step: 1", "Step: 0.5", "Step: 0.25", "Step: 0.125", "Step: 0.0625");
        title("RK4: x2(t)");
        hold off;
        % draw x1(t) and x2(t) versus time for 2 different steps
        figure;
        [t, x] = RK4(0.25, 15);
        plot(t, x(:, 1));
        hold on;
        plot(t, x(:, 2));
        [t, x] = RK4(0.5, 15);
        plot(t, x(:, 1));
        plot(t, x(:, 2));
        grid on;
        title("RK4: x1(t) and x2(t)");
        legend("x1, step: 0.25", "x2, step: 0.25", "x1, step: 0.5", "x2, step: 0.5");
        hold off;
        % draw x1(x2) for 2 different steps
        figure;
        [~, x] = RK4(0.25, 15);
        plot(x(:, 1), x(:, 2));
        hold on;
        [~, x] = RK4(0.5, 15);
        plot(x(:, 1), x(:, 2));
        grid on;
        title("RK4: x1(x2)");
        legend("x1, step: 0.25", "x2, step: 0.5");
        hold off;

    elseif type == "AdamPC"
        % draws x1(t) with different steps
        figure;
        h = 1;
        while (h >= 0.0625)
        [t, x] = AdamPC(h);
        plot(t, x(:, 1));
        grid on;
        hold on;
        ylim([-0.8 0.8]);
        h = h/2;
        end
        legend("Step: " + 1, "Step: " + 0.5, "Step: " + 0.25, "Step: " + 0.125, "Step: " + 0.0625);
        title("AdamPC: x1(t)");
        hold off;
        % draws x2(t) with different steps
        figure;
        h = 1;
        while (h >= 0.0625)
        [t, x] = AdamPC(h);
        plot(t, x(:, 2));
        grid on;
        hold on;
        ylim([-0.8 0.8]);
        h = h/2;
        end
        legend("Step: 1", "Step: 0.5", "Step: 0.25", "Step: 0.125", "Step: 0.0625");
        title("AdamPC: x2(t)");
        hold off;
        % draw x1(t) and x2(t) versus time for 2 different steps
        figure;
        [t, x] = AdamPC(0.25);
        plot(t, x(:, 1));
        hold on;
        plot(t, x(:, 2));
        [t, x] = AdamPC(0.5);
        plot(t, x(:, 1));
        plot(t, x(:, 2));
        grid on;
        title("AdamPC: x1(t) and x2(t)");
        legend("x1, step: 0.25", "x2, step: 0.25", "x1, step: 0.5", "x2, step: 0.5");
        hold off;
        % draw x1(x2) for 2 different steps
        figure;
        [~, x] = AdamPC(0.25);
        plot(x(:, 1), x(:, 2));
        hold on;
        [~, x] = AdamPC(0.5);
        plot(x(:, 1), x(:, 2));
        grid on;
        title("AdamPC: x1(x2)");
        legend("x1, step: 0.25", "x2, step: 0.5");
        hold off;
    else
        error("Wrong type of graph chosen!");
    end
end
    